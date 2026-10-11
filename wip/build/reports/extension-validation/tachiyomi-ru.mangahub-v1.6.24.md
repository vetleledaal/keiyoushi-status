# Extension Validation Report

- Extension: tachiyomi-ru.mangahub-v1.6.24
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
| popular_next | `getPopularManga(2)` | success | 48 | Сбиться с пути (`.../off_track`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 48 | Питер Пэн и Золушка (`.../peter_pan_and_cinderella`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Король экрана хочет быть моим спонсором (`.../the_actor_insists_on_being_my_sponsor`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Выбор между двумя (`.../you_or_you`) |  | 1-10s |
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
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Ты здесь, URL=`.../youre_here` |  |  |  |
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
