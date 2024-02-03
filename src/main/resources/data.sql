INSERT INTO public.users (id, dt, dob, email, fio, phone, status) VALUES (1, '2024-01-10 00:00:00.000000', '2024-01-10', 'test@mail.ru', 'VASILIY IVANOV', 998901234567, 1) ON CONFLICT(id) DO NOTHING;
INSERT INTO public.users (id, dt, dob, email, fio, phone, status) VALUES (2, '2024-01-11 00:00:00.000000', '2024-01-11', 'test2@mail.ru', 'DMITRY IVANOV', 998901234568, 1) ON CONFLICT(id) DO NOTHING;

INSERT INTO public.cards (id, dt, balance, card_expire, card_name, card_number, card_type, status, user_id) VALUES (1, '2024-01-10 10:56:29.000000', 5200, '07/26', 'test', '8600500423326556', 'UZ', 1, 1) ON CONFLICT(id) DO NOTHING;
INSERT INTO public.cards (id, dt, balance, card_expire, card_name, card_number, card_type, status, user_id) VALUES (2, '2024-01-10 10:56:29.000000', 1000, '07/26', 'test2', '8600500423326557', 'UZ', 1, 1) ON CONFLICT(id) DO NOTHING;

INSERT INTO public.cards_transactions (id, dt, amount, card_id, new_balance, old_balance, type, user_id) VALUES (1, '2024-01-10 10:57:21.000000', 100, 1, 5000, 5100, 'DEBIT', 1) ON CONFLICT(id) DO NOTHING;
INSERT INTO public.cards_transactions (id, dt, amount, card_id, new_balance, old_balance, type, user_id) VALUES (2, '2024-01-10 10:57:21.000000', 200, 1, 5000, 5200, 'DEBIT', 1) ON CONFLICT(id) DO NOTHING;
INSERT INTO public.cards_transactions (id, dt, amount, card_id, new_balance, old_balance, type, user_id) VALUES (3, '2024-01-10 10:57:21.000000', 100, 2, 1200, 1300, 'DEBIT', 1) ON CONFLICT(id) DO NOTHING;
INSERT INTO public.cards_transactions (id, dt, amount, card_id, new_balance, old_balance, type, user_id) VALUES (4, '2024-01-10 10:57:21.000000', 200, 2, 1000, 1300, 'DEBIT', 1) ON CONFLICT(id) DO NOTHING;
