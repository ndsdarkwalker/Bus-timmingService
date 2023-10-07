# Bus-timmingService
You are a backend engineer who is tasked to plan and build a bus-timing service to provide
API endpoints for the frontend engineers to build upon (Command-line interface program
would not be accepted). You are given 2 endpoints from an external API provider for (1) the
details about the available bus lines, and (2) the bus locations of the running buses based on
bus lines, without much information obtainable from the external API provider (i.e. you need
to make sense of the data yourself).


(1) Details about the available bus lines
GET "https://test.uwave.sg/busLines"

(2) Bus locations of the running buses based on bus lines
GET "https://test.uwave.sg/busPositions/" + busLineId
Bus Line Ids to choose from
[]string{"44478", "44479", "44480", "44481"}
e.g. https://test.uwave.sg/busPositions/44478

As the data is live, it is possible that there is no data available at different hours of the day.
Alternative, you can use the endpoint below to see an example of the structure of the
response: https://test.uwave.sg/example/busPositions
You have to filter, explore, process and format the data from the external API provider, and
present the relevant information through your backend service endpoints for the frontend
engineers to use.

Your tasks are as follows:
1. Explore the data from the external API provider
   ● You should try to make sense of the values of each field (but you do not have to
   explicitly state out the meaning of each field as this step is just for your own
   understanding of the data)
   ● You can include the scripts that you used in exploring the data to show your thought
   process.
   ● You can show any insights you have found based on exploring and understanding
   the data given.
   ● You can choose to skip this task as well, as this is just preparatory work for
   subsequent tasks.

2. Plan a bus-timing backend service with the required endpoints
   Your endpoint(s) should provide the following information:

3. Relevant information of the bus stops and bus lines

4. Locations of the running buses in the requested bus line

5. Estimated arrival time/duration of the incoming buses at the requested bus stop*
   Do note that:
   ● You have the freedom to define the requests and responses for your own endpoints.
   ● You should explain sufficiently for each of your design decisions.
   ● You can add additional features e.g. storage/caching, if you deem it necessary.
   ● *For the estimation of arrival time/duration, you need to explain clearly your method
   to estimate the values, as well as the pros and cons of using the method to estimate
   the arrival time.

6. Build the bus-timing backend service according to the plan
   ● The coded solution must be in the Go programming language.
   ● You can use/copy any resources that can be found online, but you must be able to
   understand what it does, and be able to answer what it does when asked.
   ● You can use any available libraries/packages.
   ● The code need not be fully functional, but extra points are given for a running set-up.