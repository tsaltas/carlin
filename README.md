
# ThirdChannel Programming test

This is a small programming test that all 3C candidates should take. Candidates should choose from one of the Problems listed below, then issue a pull request of their solution to this repo. This is designed to be a small task, taking no more than an hour or so.


#### Notes and Directions

*	Again, select one of the questions/problems below
*	Work should be done in the appropriate folder; more information about the problem may be inside
*	Spend no more than an hour or two on this
*	Do not worry about completion, this is more to see your thought process and creativity
*	Some of the questions are vague on purpose; we are curious to see what happens without full, rigid instruction
*	Work should be done in a branch off of `master`
*	When complete, issue a pull request against `master` with your branch


### Problem 1

In folder `problem_1`, you should find a static .html page containing a form with some inputs and a submit button. The goal here is to provide client-side validation on a form, which is a US-centric user information input. The fields should validate according to the following rules:

*	__first_name__, __last_name__: no numbers
*	__state__, __zip__: should be valid US values
*	__email__: should be a valid email address
*	__date__: should be in format "month/day/year" (again, US centric)
*	All fields except for __street1__ and __street2__ are required
*	On submit, show some confirmation that the form was submitted
*	It's up to you to figure out how to display validation errors to the user and when to do so
*	DOM manipulation is encouraged
*	Editing of the HTML file is also encouraged
*	The form isn't styled - much - either (potential hint, feel free to blow away the minor amount that's present)
*	All the form inputs are are 'text', but maybe they don't need to be
*	Again, this is front-end, client side scripting only

There's no server to post the form input to, so don't worry about that. Feel free to use any framework or metholodgy you'd like.

### Problem 2

In folder `problem_2`, create a small server that accepts JSON posted at some endpoint. This JSON should then be parsed and rendered however you'd like (e.g. an html response, a log file), but not simply to the command line. We leave the term 'rendered' vague on purpose. The JSON may be posted in several ways, e.g. via `curl` or via an AJAX call.

There is a sample .json file in `problem_2` which gives the format your server should expect. The server should *only* render the fields found in the .json file; others should be ignored. List values may not necesarrily have a fixed size. Take note of the value type in each of the fields (e.g. string, number, boolean).

Feel free to use any language or framework to complete this task. In the Pull Request, provide some sample usage instructions (e.g. the endpoint to post), as well as how to run your server


