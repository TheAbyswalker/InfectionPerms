# InfectionPerms

This plugin was designed and developed for the __InfectionMC Network__.  It was coded by TheAbyswalker for that network and not for general use.

##Commands, Permissions and descriptions##
###Create rank command###
Usage: /rank create {rank name}
Permissions: infectionmc.admin.create
Description: This command allows the user to create a rank. The rank has no inheritance or permissions by default.

###Delete rank command###
/rank delete {rank name}
Permissions: infectionmc.admin.delete
Description: This command allows the user to delete a rank.

###Inherit rank command###
/rank inherit {rank one} {rank two}
Permissions: infectionmc.admin.inherit
Description: This command allows the user to make one rank inherit another ranks permissions. Ranks one will inherit rank two.

###Add player command###
/rank set {rank} {player}
Permissions: infectionmc.admin.addplayer
Description: This command allows the user to add rank to a player.

###Remove player command###
/rank remove {player} {rank}
Permissions: infectionmc.admin.removeplayer
Description:  This command allows the user to remove a rank from a player.

###Create prefix command###
/rank prefix {rank} {prefix}
Permissions: infectionmc.admin.prefix.create
Description: This command allows the user to create a prefix for the rank.

###Prefix clear command###
/rank prefix clear {rank}
Permissions: infectionmc.admin.prefix.clear
Description: This command allows the user to remove the prefix for the specified rank.

###Add perm command###
/rank {rank name} add {permission node}
Permissions: infectionmc.admin.addperm
Description: This command allows the user to add a permission node to the specified rank.

###Remove perm command###
/rank {rank name} remove {permissions node}
Permissions: infectionmc.admin.removeperm
Description: This command allows the user to remove a permission node from the specified group.

###Clearn perm command###
/rank {rank name} clear
Permissions: infectionmc.admin.clearperm
Description: This command allows the user to clear all permission nodes from the spicified rank.

###Extra permissions###
Permission: infectionmc.*
Description: Allows the user to access all commands for this permissions plugin.