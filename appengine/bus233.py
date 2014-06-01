import webapp2
import json
from google.appengine.ext import db
from google.appengine.api import users
import urllib2
import re
import time

class MainPage(webapp2.RequestHandler):
    def post(self):
        obj = json.loads(self.request.body)

        self.saveUser(obj['email'])
        
        self.response.headers['Content-Type'] = 'text/plain'
        self.response.write(json.dumps({ 'status' : 'ok' }))

    def saveUser(self, email):
        user = User()
        user.email = email
        user.time = int(time.time())
        user.put()


application = webapp2.WSGIApplication([
    ('/signup', MainPage)
], debug=True)

class User(db.Model):
    email = db.StringProperty()
    time = db.IntegerProperty()
