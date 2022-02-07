Modeling a sports team - Rugby

UML - Unified Modelling Language

*_POJOs_*
These are all POJOs (Plain Old Java Objects)

*Player*

String name
String position
int number
int contractLength

* getters/setters

*Manager*

String name

* getters and setters

*Team*

Player[15] players
String name
Manager manager

* getters/setters

/*****************************************/
*_SERVICE CLASSES_*

*TeamService*

addPlayerToTeam(Team, Player) : void
countEmptySpacesOnTeam(Team) : int       (don't call getEmptySpaces, etc - implies it is a Getter!)
addManagerToTeam (Team, Manager): void


/*****************************************/
Will be more complex - leave this for now!
*Tournament*

int numberOfTeams
String location
Team[] teams
/*****************************************/