# Extension Validation Report

- Extension: tachiyomi-ru.mangahub-v1.6.25
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8601336865408732240
- Source name: Mangahub
- Source language: ru
- Selected manga input: popular offset 0: Ты здесь (`.../youre_here`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Ты здесь (`.../youre_here`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | Смирна и Капри (`.../smyrna_and_capri`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 48 | Тайный брак господина лиса (`.../the_foxs_thief_marriage_1`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Камиина Ботан: Пьяная внешность словно лилия (`.../kamiina_botan_drunk_figure_is_lily_flower`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Ты здесь (`.../youre_here`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ты здесь (`.../youre_here`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 158 | Том 1. Глава 1 (`.../59417`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ты здесь, URL=`.../youre_here` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 212/212 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 212/212 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p1.statichub.org/.../1769097.jpeg` (image/jpeg, 38983 bytes, 399x604) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../youre_here` |  |  |  |
| details thumbnail URL | PASS | `https://p1.statichub.org/.../1769097.jpeg` |  |  |  |
| details author | PASS | Д. Цзюнь |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Драма, Комедия, Романтика, Школа, Повседневность, Сёнэн-ай, Дружба, ГГ мужчина, Умный ГГ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Приём новичков - задача Ю Яна, и он помогает нелюдимому и высоченному Ли Хуану, человеку, который делает всё, чтобы не нравиться окружающим. Но стоило узнать гиганта получше, как Ю Ян обнаруживает, что тот не такой уж и плохой человек... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 158 chapters |  |  |  |
| chapter dates | PASS | 158 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network>` (image/jpeg, 530162 bytes, 996x7953) |  |  |  |
