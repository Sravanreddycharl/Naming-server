
Vagrant.configure(2) do |config|

  config.vm.box = "bofh/mongodb"
  config.vm.network "private_network", ip: "192.168.50.30"
  config.vm.hostname = "mongodb"
  config.vm.provider "virtualbox" do |vb|
     vb.memory = "1024"
     vb.cpus = 1
   end
end
