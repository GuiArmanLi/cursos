using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace PrintFramerAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    [ProducesResponseType(StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status500InternalServerError)]
    public class PriceFrameController : ControllerBase
    {
        /// <summary>
        /// Retorna o preço do quadro de acordo com a altura e largura
        /// </summary>
        /// <param name="Height">Tamanho do quadro desejado</param>>
        /// <param name="Width">Largura do quadro desejado</param>>
        ///<returns>Valor do quadro</returns>
        /// <remarks>
        /// Retorna "not valid" se as o perimetro total for menor que 20 e maior que 100
        /// </remarks>
        [HttpGet("{Height}/{Width}", Name = $"{nameof(GetPrice)}")]
        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status400BadRequest)]
        public IActionResult GetPrice(string Height, string Width)
        {
            var result = CalculatePrice(Double.Parse(Height), Double.Parse(Width));
            var response = $"The cost of a {Height}x{Width} frame is {result}";

            if (result == "not valid")
                return BadRequest(response);
            return Ok(response);
        }

        private string CalculatePrice(double height, double width)
        {
            double perimeter;
            perimeter = (2 * height) + (2 * width);

            if ((perimeter > 20.00) && (perimeter <= 50.00))
            {
                return "20.00";
            }

            if ((perimeter > 50.00) && (perimeter <= 100.00))
            {
                return "50.00";
            }

            if ((perimeter > 100.00) && (perimeter <= 1000.00))
            {
                return "100.00";
            }

            return "not valid";
        }
    }
}