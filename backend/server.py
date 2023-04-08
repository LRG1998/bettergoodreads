from flask import Flask
import flask
import json

app = Flask(__name__)

@app.route("/")

@app.route('/users', methods=["GET"])
def users():
    print("users endpoint reached")
    with open("user.json", "r") as f:
        data = json.load(f)


if __name__ == "__main__":
    app.run("localhost",5175)
