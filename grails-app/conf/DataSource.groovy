dataSource {
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = true
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
	development {
		dataSource {
			username = "pds"
			password = "pds"
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy"
			driverClassName = "com.mysql.jdbc.Driver"
		
		}
	}
	test {
		dataSource {
			username = "pds"
			password = "pds"
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy"
			driverClassName = "com.mysql.jdbc.Driver"
			
		
		}
	}
	production {
		dataSource {
			username = "pds"
			password = "pds"
			pooled = true
			dbCreate = "update" // one of 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost/dummy"
			driverClassName = "com.mysql.jdbc.Driver"
		
		}
	}
}

