# Extension Validation Report

- Extension: tachiyomi-en.mangaowlio-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2031498907928923621
- Source name: MangaOwl.io (unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Dark fall (`.../9095`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Dark fall (`.../9095`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | UNDER THE GREEN LIGHT (`.../9085`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | I Won’t Resign to Be Tamed by My Enemy Uncle (`.../10493`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Full-Time Awakening (`.../10156`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 8 | Dark fall (`.../9095`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dark fall (`.../9095`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 191 | 0 (`.../dark-fall-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dark fall, URL=`9095` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 108/108 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 92/108 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaowl.io/.../dark-fall-9095-175x238.jpg` (image/jpeg, 27684 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `9095` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangaowl.io/.../dark-fall-9095.jpg` (image/jpeg, 32455 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Updating: Show more |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 191 chapters |  |  |  |
| chapter dates | LINT | All 191 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=191 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangaowl.io/.../1-001.jpg` (image/jpeg, 186726 bytes, 420x560) |  |  |  |
