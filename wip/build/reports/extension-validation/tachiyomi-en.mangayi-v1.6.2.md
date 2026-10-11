# Extension Validation Report

- Extension: tachiyomi-en.mangayi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 712011166912060070
- Source name: MangaYi
- Source language: en
- Selected manga input: popular offset 0: I Was Mistaken As a Monstrous Genius Actor (`.../i-was-mistaken-as-a-monstrous-genius-actor`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | I Was Mistaken As a Monstrous Genius Actor (`.../i-was-mistaken-as-a-monstrous-genius-actor`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | My Uncle in Another World (`.../my-uncle-in-another-world`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | I Was Mistaken As a Monstrous Genius Actor (`.../i-was-mistaken-as-a-monstrous-genius-actor`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Was Mistaken As a Monstrous Genius Actor (`.../i-was-mistaken-as-a-monstrous-genius-actor`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 121 | Chapter 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 25 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Was Mistaken As a Monstrous Genius Actor, URL=`i-was-mistaken-as-a-monstrous-genius-actor` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scp.keterfoundation.com/.../i-was-mistaken-as-a-monstrous-genius-actor.jpg` (image/jpeg, 228915 bytes, 615x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `i-was-mistaken-as-a-monstrous-genius-actor` |  |  |  |
| details thumbnail URL | PASS | `https://scp.keterfoundation.com/.../i-was-mistaken-as-a-monstrous-genius-actor.jpg` |  |  |  |
| details author | PASS | Jungseong Manyeo, Jangtan, Haega |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Seinen, Adventure, Drama, Comedy, Romance, Fantasy, Supernatural, Manhwa, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | One day, Kang Woo-jin suddenly gains the ability to enter a subspace when he reads a script or scenario, and to become the character himself through the subspace.<br>And then, at an audition location where he followed his friend, he happened to show the acting he experienced through the subspace…? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 121 chapters |  |  |  |
| chapter dates | PASS | 121 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 25 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://scp.keterfoundation.com/.../1.jpg` (image/jpeg, 176662 bytes, 720x3000) |  |  |  |
