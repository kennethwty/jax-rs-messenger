# messenger-api
Building a very, very, very simple messenger RESTful api using JAX-RS (Jersey). The purpose of this repo is to experience how to build a RESTful API in Java.

The API currently supports the following endpoints:

`/messenger/webapi/messages`  
`/messenger/webapi/messages/{messageId}`  

## Data Source
Since the goal of this repo is just to experience writing APIs with JAX-RS, I've simply created a Database class acting as an in-memory database. Will probably add a datasource like MySQL later.
