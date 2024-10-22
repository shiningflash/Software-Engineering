from typing import Any


class SingletonMeta(type):
    _instances = {}
    
    def __call__(cls, *args: Any, **kwds: Any) -> Any:
        if cls not in cls._instances:
            instance = super().__call__(*args, **kwds)
            cls._instances[cls] = instance
        return cls._instances[cls]
    
    
class Singleton(metaclass=SingletonMeta):
    def some_business_logic(self):
        print('Business logic here ...')


if __name__ == '__main__':
    s1 = Singleton()
    s2 = Singleton()
    
    print(s1, s2, id(s1), id(s2))
    
    if id(s1) == id(s2):
        print('Singleton works!! s1 and s2 both contain same instance.')
    else:
        print('Single failed! Both variables contain different instances.')
