package space.bumsoap.sec.csrf_poman.filter;

import java.io.IOException;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CsrfLoggerFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		CsrfToken csrfToken = (CsrfToken) request.getAttribute("_csrf");
		response.setHeader("CSRF-TOKEN-VALUE", csrfToken.getToken());
		filterChain.doFilter(request, response);
	}
}
