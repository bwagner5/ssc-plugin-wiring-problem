import edu.nps.moves.security.Role
import edu.nps.moves.security.User
import edu.nps.moves.security.UserRole

class BootStrap
{

  def init = {servletContext ->

    User u = new User('admin', 'admin').save()
    Role r = new Role('ROLE_ADMIN').save()

    UserRole.create(r, u, true)

    u = new User('user', 'user').save()
    r = new Role('ROLE_USER').save()

    UserRole.create(u, r, true)
  }

  def destroy = {
  }
}
