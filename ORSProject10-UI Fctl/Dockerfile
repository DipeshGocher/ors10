# Use a lightweight web server as the base image
FROM nginx:alpine

# Remove the default Nginx configuration
RUN rm -rf /usr/share/nginx/html/*

# Copy the contents of your local 'dist' folder in
COPY dist/P10-UI /usr/share/nginx/html

# Expose the default Nginx port (usually port 80)
EXPOSE 80

# Start Nginx when the container is run 
CMD ["Nginx", "-g", "daemon off;"]