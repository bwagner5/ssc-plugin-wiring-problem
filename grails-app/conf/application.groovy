

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'edu.nps.moves.security.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'edu.nps.moves.security.UserRole'
grails.plugin.springsecurity.authority.className = 'edu.nps.moves.security.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/':                ['permitAll'],
	'/error':           ['permitAll'],
	'/index':           ['permitAll'],
	'/index.gsp':       ['permitAll'],
	'/shutdown':        ['permitAll'],
	'/assets/**':       ['permitAll'],
	'/**/js/**':        ['permitAll'],
	'/**/css/**':       ['permitAll'],
	'/**/images/**':    ['permitAll'],
	'/**/favicon.ico':  ['permitAll']
]

