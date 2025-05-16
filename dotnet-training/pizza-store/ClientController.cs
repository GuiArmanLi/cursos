using Microsoft.AspNetCore.Mvc;

namespace PizzaStore;

[ApiController]
[Route("/")]
public class ClientController
{
    
    [HttpGet]
    public string GetClient()
    {
        return "Client";
    }
}