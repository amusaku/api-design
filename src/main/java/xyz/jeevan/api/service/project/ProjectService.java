package xyz.jeevan.api.service.project;

import xyz.jeevan.api.domain.Project;

public interface ProjectService {

  /**
   * Service method to create new project.
   *
   * @param project Project information object.
   */
  void create(Project project);

  /**
   * Find project by id.
   *
   * @param id project id.
   * @return {@code Project} project information object.
   */
  Project getById(String id);
}