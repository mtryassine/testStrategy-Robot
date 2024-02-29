classDiagram
direction BT
class AgressifBehaviour
class DefensifBehaviour
class IBehaviour {
<<Interface>>

}
class Main
class NormalBehaviour
class Robot

AgressifBehaviour  ..>  IBehaviour 
DefensifBehaviour  ..>  IBehaviour 
NormalBehaviour  ..>  IBehaviour 
