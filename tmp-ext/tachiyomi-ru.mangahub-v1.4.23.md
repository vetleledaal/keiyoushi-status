# Extension Validation Report

- Extension: tachiyomi-ru.mangahub-v1.4.23
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8601336865408732240
- Source name: Mangahub
- Source language: ru
- Selected manga input: popular offset 0: Ты здесь (`.../youre_here`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | Ты здесь (`.../youre_here`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 48 | Милый дом (`.../sweet_home_hwang_youngchan_2018`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 48 | Слепое доверие (`.../trustfall`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 48 | Достижение богатства с помощью системы лояльности (`.../after_becoming_financially_free_they_offered_their_loyalty`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | Выбор между двумя (`.../you_or_you`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ты здесь (`.../youre_here`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 158 | Том 1. Глава 1 (`.../59417`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| details genres | PASS | Драма, Комедия, Романтика, Школа, Повседневность, Сёнэн-ай, Дружба, #ГГ мужчина, #Умный ГГ |  |  |  |
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
