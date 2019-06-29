# messenger-api
Building a very, very, very simple messenger RESTful api using JAX-RS (Jersey). The purpose of this repo is to experience writing RESTful APIs in Java using the Jersey implementation.

The API currently supports the following endpoints:

`/messenger/webapi/messages`  
`/messenger/webapi/messages/{messageId}`  

## Data Source
Since the goal of this repo is just to experience writing APIs with JAX-RS, I've simply created a Database class acting as an in-memory database instead of spinning up a real database and writing SQL and all that... Will probably add a real datasource such as MySQL later.
