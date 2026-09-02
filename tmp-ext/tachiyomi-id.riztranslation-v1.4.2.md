# Extension Validation Report

- Extension: tachiyomi-id.riztranslation-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7209416153926734838
- Source name: Riztranslation
- Source language: id
- Selected manga input: latest offset 0: Shinitai Shoujo no Death Game (`.../59`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Shinitai Shoujo no Death Game (`.../59`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Setogiwa ni Todoroku (`.../29`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 9 | Shinitai Shoujo no Death Game (`.../59`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 7 | Akogare no Hito ni Hanashikakeraretara (`.../48`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Shinitai Shoujo no Death Game (`.../59`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Shinitai Shoujo no Death Game (`.../59`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 0 - Oneshot (`.../165`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 60 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 9 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shinitai Shoujo no Death Game, URL=`59` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Boku no Ikezuna Konyakusha, URL=`45` at page 1 offset 8 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://res.cloudinary.com/.../ek0ngqc6kfpnjqoxbdg4.webp` (image/webp (container: extended), 303564 bytes, 1280x1810) |  |  |  |
| details identity | PASS | Details preserved selected URL `59` |  |  |  |
| details thumbnail URL | PASS | `https://res.cloudinary.com/.../ek0ngqc6kfpnjqoxbdg4.webp` |  |  |  |
| details author | PASS | Sun |  |  |  |
| details artist | PASS | Sun |  |  |  |
| details genres | PASS | Drama, Slice of Life |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://res.cloudinary.com/.../is0lb6ilp3he3h48gxtz.webp` (image/webp (container: extended), 22136 bytes, 1280x720) |  |  |  |
