# Extension Validation Report

- Extension: tachiyomi-en.hentainexus-v1.6.20
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7719798645438596394
- Source name: HentaiNexus
- Source language: en
- Selected manga input: popular offset 0: Just Do It Until You're Satisfied (`.../16391`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Just Do It Until You're Satisfied (`.../16391`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | I Can't Get it Up Without Two Pairs of Big Breasts, So My Wife Brought Her Friend: Compilation (`.../20377`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 30 | Dick Me Deeply Even Though You're Hung and Scary 4 (`.../22063`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Weekly Kairakuten Key-Visual Collection 106 (`.../22019`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Just Do It Until You're Satisfied (`.../16391`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Just Do It Until You're Satisfied (`.../16391`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../16391`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Just Do It Until You're Satisfied, URL=`.../16391` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.hentainexus.com/.../002.png.thumb.jpg` (image/jpeg, 84719 bytes, 480x672) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../16391` |  |  |  |
| details thumbnail URL | PASS | `https://images.hentainexus.com/.../002.png.thumb.jpg` |  |  |  |
| details author | PASS | Souseki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | beauty mark, big areolae, busty, condom, facial, fangs, gyaru, hentai, inseki, inverted nipples, light hair, mating press, paizuri, pubic hair, uncensored, unlimited, vanilla, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Magazine: Comic Kairakuten 2024-04<br>Parody: Original Work<br>Publisher: FAKKU<br>Pages: 24<br>Favorites: 744<br><br>Her guard is impenetrable. ♥ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.hentainexus.com/.../001.webp` (image/webp (encoding: lossy), 598478 bytes, 1360x1920) |  |  |  |
