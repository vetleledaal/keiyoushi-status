# Extension Validation Report

- Extension: tachiyomi-ru.mangahub-v1.4.23
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
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
- Selected manga input: latest offset 0: О совершенной мести (`.../about_the_perfect_revenge`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | Ты здесь (`.../youre_here`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 48 | Нань Хао и Шан Фэнь (`.../nan_hao_and_shang_feng`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 48 | О совершенной мести (`.../about_the_perfect_revenge`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 48 | Улица Святых (`.../all_saints_street`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | О совершенной мести (`.../about_the_perfect_revenge`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | О совершенной мести (`.../about_the_perfect_revenge`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 23 | Том 1. Глава 1 (`.../936181`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=О совершенной мести, URL=`.../about_the_perfect_revenge` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 212/212 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 212/212 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://p1.statichub.org/.../2655319.jpg` (image/jpeg, 79449 bytes, 400x540) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../about_the_perfect_revenge` |  |  |  |
| details thumbnail URL | PASS | `https://p1.statichub.org/.../2655319.jpg` |  |  |  |
| details author | PASS | NAJEONG |  |  |  |
| details artist | PASS | Yong Sa-Yong |  |  |  |
| details genres | PASS | Драма, Романтика, #ГГ женщина, #Средневековье |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 23 chapters |  |  |  |
| chapter dates | PASS | 23 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ty2.statichub.org/.../40ba7049c1f611d16bb2880fb395dda6af5f0452.jpg` (image/jpeg, 587808 bytes, 800x14649) |  |  |  |
