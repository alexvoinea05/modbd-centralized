import { IAppUser, NewAppUser } from './app-user.model';

export const sampleWithRequiredData: IAppUser = {
  idUser: 1883,
  email: 'Roxanne_Hackett@hotmail.com',
  password: 'Borders mobile',
  lastName: 'Turner',
  firstName: 'Maryam',
  cnp: 'Spring',
};

export const sampleWithPartialData: IAppUser = {
  idUser: 96514,
  email: 'Justina_Mueller45@gmail.com',
  password: 'Books',
  lastName: 'Schamberger',
  firstName: 'Hal',
  cnp: 'Practical',
};

export const sampleWithFullData: IAppUser = {
  idUser: 71736,
  email: 'Oswaldo.Kirlin@hotmail.com',
  password: 'solid',
  balance: 55911,
  lastName: 'Dietrich',
  firstName: 'Imani',
  cnp: 'white Dalasi panel',
};

export const sampleWithNewData: NewAppUser = {
  email: 'Janelle_Hahn72@hotmail.com',
  password: 'Summit Concrete',
  lastName: 'Jacobi',
  firstName: 'Shania',
  cnp: 'Salad',
  idUser: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
