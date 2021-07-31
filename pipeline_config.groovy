libraries{
  ansible{
    deploy_to
  }
  maven{
    message = "My config message from Governance"
    build
  }
}

application_environments{
  dev{
    eks_cluster = "eks_lab01"
  }
  pre{
    eks_cluster = "eks_pre"
  }
}
