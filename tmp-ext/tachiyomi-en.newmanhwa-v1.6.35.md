# Extension Validation Report

- Extension: tachiyomi-en.newmanhwa-v1.6.35
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3639911276143172075
- Source name: New Manhwa
- Source language: en
- Selected manga input: popular offset 0: Beautiful Days (`.../beautiful-days`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Beautiful Days (`.../beautiful-days`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Beautiful Days (`.../beautiful-days`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Ramia-Yana (`.../ramia-yana`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Pick Me Up (`.../pick-me-up`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Beautiful Days (`.../beautiful-days`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 90 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Beautiful Days, URL=`.../beautiful-days` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Beautiful Days, URL=`.../beautiful-days` at page 1 offset 0 and page 2 offset 0, title=I Didn’t Sign Up For This, URL=`.../i-didn-t-sign-up-for-this` at page 1 offset 1 and page 2 offset 1, title=Get Out of Here!, URL=`.../get-out-of-here` at page 1 offset 3 and page 2 offset 8, title=Sugar Daddy / Papa Katz, URL=`.../sugar-daddy-papa-katz` at page 1 offset 14 and page 2 offset 4, title=Set It!, URL=`.../set-it` at page 1 offset 17 and page 2 offset 22, title=A Theme For Every Building, URL=`.../a-theme-for-every-building` at page 1 offset 20 and page 2 offset 5 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.saymanhwa.com/.../20260821051257-2b4441d9bb8d-thumb-300x420.webp` (image/webp (encoding: lossy), 12120 bytes, 300x420) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../beautiful-days` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | Yuwol |  |  |  |
| details artist | PASS | Nunnya |  |  |  |
| details genres | PASS | Action, Drama, Ecchi, Fantasy, Harem, Historical, Martial Arts, Mature, Mystery, Psychological, Romance, School Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | People who live hiding their individual circumstances and desires in silence, but hope that one day they will bloom. “I’ll unveil every single part of you-your skin, sweat, scent, and moans…” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 90 chapters |  |  |  |
| chapter dates | PASS | 90 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://saymanhwa.com/.../popular <redacted query values: page>` to `https://saymanhwa.com/.../popular` (2 redirects); popular: `https://saymanhwa.com/.../latest <redacted query values: page>` to `https://saymanhwa.com/.../latest` (2 redirects); popular: `https://saymanhwa.com/.../popular <redacted query values: page>` to `https://saymanhwa.com/.../popular <redacted query values: page>` (1 redirects); popular: `https://saymanhwa.com/.../series <redacted query values: q and sort>` to `https://saymanhwa.com/.../series <redacted query values: q and sort>` (1 redirects); popular: `https://saymanhwa.com/.../latest <redacted query values: page>` to `https://saymanhwa.com/.../latest <redacted query values: page>` (1 redirects) |  |  |  |
| page load | PASS | `https://img03.manhwabuddy.com/.../1-e12.jpg` (image/jpeg, 1037416 bytes, 720x14424) |  |  |  |
