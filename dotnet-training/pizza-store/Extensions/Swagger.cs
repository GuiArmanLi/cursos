using Microsoft.OpenApi.Models;

namespace PizzaStore.Extensions;

public static class Swagger
{
    public static void AddSwaggerSetup(this IServiceCollection services)
    {
        services.AddEndpointsApiExplorer();

        services.AddSwaggerGen(s =>
            s.SwaggerDoc("PizzaStore", new OpenApiInfo { Title = "PizzaStore", Version = "v1" }));
    }

    public static void AddSwaggerUi(this WebApplication app)
    {
        app.UseSwagger();
        app.UseSwaggerUI(s => s.SwaggerEndpoint("/swagger/v1/swagger.json", "PizzaStore v1"));
    }
}