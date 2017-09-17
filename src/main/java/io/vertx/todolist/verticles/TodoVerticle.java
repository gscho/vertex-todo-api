package io.vertx.todolist.verticles;

import io.vertx.core.AbstractVerticle;

public class TodoVerticle extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer()
        .requestHandler(req -> req.response().end("Hello Vert.x!"))
        .listen(8080);
  }

}
