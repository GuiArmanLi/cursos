using PizzaStore.Extensions;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddCors();
builder.Services.AddControllers();
builder.Services.AddRouting();
builder.Services.AddSwaggerSetup();

var app = builder.Build();
// app.AddSwaggerUi();
app.UseSwagger();
app.UseSwaggerUI(s => s.SwaggerEndpoint("/swagger/PizzaStore/swagger.json", "PizzaStore V1"));
app.UseHttpsRedirection();
app.UseCors(policyBuilder => policyBuilder
    .SetIsOriginAllowed(_ => true)
    .AllowAnyOrigin()
    .AllowAnyMethod()
    .AllowAnyHeader());
app.MapControllers();
app.Run();