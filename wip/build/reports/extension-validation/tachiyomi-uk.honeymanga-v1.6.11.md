# Extension Validation Report

- Extension: tachiyomi-uk.honeymanga-v1.6.11
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4712783922379490416
- Source name: HoneyManga
- Source language: uk
- Selected manga input: popular offset 0: Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 29 | Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Лиходій прагне вижити (`.../35284283-31ba-456f-8d89-a33ec606af42`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Маг піску з Випаленої пустелі (`.../c8316e88-499a-49cc-b03e-ea2bd4f98653`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Посібник з виживання бродячого лицаря (`.../bd1f1106-3298-451e-b785-6fcfe1a7d526`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Обери мене! (`.../52e6a78a-8930-4265-b0eb-f77c0dcb6b96`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 220 | Том 1 - Розділ 1 (`.../38f5e0ec-3675-4325-9cd2-fd791fa2ab53`) |  | <1s |
| pages | `getPageList(chapter)` | success | 55 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 29 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Обери мене!, URL=`52e6a78a-8930-4265-b0eb-f77c0dcb6b96` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hmvolumestorage.b-cdn.net/.../611a3bed-7b16-4e51-881c-d700a3d95c31` (image/png, 5372744 bytes, 2000x2861) |  |  |  |
| details identity | PASS | Details preserved selected URL `52e6a78a-8930-4265-b0eb-f77c0dcb6b96` |  |  |  |
| details thumbnail URL | PASS | `https://hmvolumestorage.b-cdn.net/.../611a3bed-7b16-4e51-881c-d700a3d95c31` |  |  |  |
| details author | PASS | Hermode/Cho Wooneh (RedIce Studio) |  |  |  |
| details artist | PASS | Redice Studio/(3B2S) |  |  |  |
| details genres | PASS | Манхва, Фентезі, Екшн, Магія, Пригоди, Кіберпанк, ГГ чоловік, Виживання, Підземелля, Система, Артефакти, Бої на мечах, Гільдії, Чарівники |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Локі, гравець, що посідає 5-те місце у світі, втрачає свідомість під час рейду Підземелля в мобільній ґача-грі. «Що? Я тепер ігровий персонаж?». Прийшовши до тями, Локі усвідомлює, що став 1-зірковим героєм першого рівня – Ганом Іслатом. Щоб повернутися на Землю, йому необхідно підкорити 100-рівневу Вежу! Але спочатку він має допомогти Майстру-новачку та іншим героям опанувати ігрові механіки. «Не на того напали». Це розповідь про героя Локі, що ніколи не визнає жодної поразки. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 2 name, chapter 12 name, chapter 14 name, chapter 16 name, chapter 17 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 30 name, chapter 38 name, chapter 40 name, chapter 50 name, chapter 58 name, chapter 74 name, chapter 113 name, chapter 115 name |  |  |  |
| chapters | PASS | 220 chapters |  |  |  |
| chapter dates | PASS | 220 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | FAIL | Page indices must start at 0 and increase by 1. Page 3 uses index 10. Page 4 uses index 11. Page 5 uses index 12. Page 6 uses index 13. Page 7 uses index 14. Page 8 uses index 15. Page 9 uses index 16. Page 10 uses index 17. Page 11 uses index 18. Page 12 uses index 19. Page 13 uses index 2. Page 14 uses index 20. Page 15 uses index 21. Page 16 uses index 22. Page 17 uses index 23. Page 18 uses index 24. Page 19 uses index 25. Page 20 uses index 26. Page 21 uses index 27. Page 22 uses index 28. Page 23 uses index 29. Page 24 uses index 3. Page 25 uses index 30. Page 26 uses index 31. Page 27 uses index 32. Page 28 uses index 33. Page 29 uses index 34. Page 30 uses index 35. Page 31 uses index 36. Page 32 uses index 37. Page 33 uses index 38. Page 34 uses index 39. Page 35 uses index 4. Page 36 uses index 40. Page 37 uses index 41. Page 38 uses index 42. Page 39 uses index 43. Page 40 uses index 44. Page 41 uses index 45. Page 42 uses index 46. Page 43 uses index 47. Page 44 uses index 48. Page 45 uses index 49. Page 46 uses index 5. Page 47 uses index 50. Page 48 uses index 51. Page 49 uses index 52. Page 50 uses index 53. Page 51 uses index 54. Page 52 uses index 6. Page 53 uses index 7. Page 54 uses index 8. Page 55 uses index 9. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page URLs | PASS | 55 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hmvolumestorage.b-cdn.net/.../888a37d2-03bf-4e1d-b2f2-4b5a446d4101` (image/webp (encoding: lossy), 100922 bytes, 800x3000) |  |  |  |
