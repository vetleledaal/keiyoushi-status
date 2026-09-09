# Extension Validation Report

- Extension: tachiyomi-en.hentaikun-v1.6.1
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
- Source ID: 2420370334023011697
- Source name: HentaiKun
- Source language: en
- Selected manga input: popular offset 0: While Mommy Is Sleeping (`.../while-mommy-is-sleeping-1749`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | While Mommy Is Sleeping (`.../while-mommy-is-sleeping-1749`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | The Conclusion of NTR (`.../the-conclusion-of-ntr-9117`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Now Living with my father-in-law, I was supposed to have a happy newlywed life (`.../now-living-with-my-father-in-law-i-was-supposed-to-have-a-happy-newlywed-life-14743`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Gaming with the Girlfriend (`.../gaming-with-the-girlfriend-15161`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | While Mommy Is Sleeping (`.../while-mommy-is-sleeping-1749`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | While Mommy Is Sleeping (`.../while-mommy-is-sleeping-1749`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Read (`.../read`) |  | <1s |
| pages | `getPageList(chapter)` | success | 31 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=While Mommy Is Sleeping, URL=`.../while-mommy-is-sleeping-1749` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s1.hendata.com/.../manga-hentai-While-Mommy-Is-Sleeping-thumb-s200.jpg` (image/jpeg, 7935 bytes, 200x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../while-mommy-is-sleeping-1749` |  |  |  |
| details thumbnail URL | PASS | `https://s1.hendata.com/.../manga-hentai-While-Mommy-Is-Sleeping-thumb-s200.jpg` |  |  |  |
| details author | PASS | Kiyokawa Zaidan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Original Work, Cheating, Color, Housewife, Incest, Oppai, Oral |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 31 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s1.hendata.com/.../001.jpg` (image/jpeg, 45520 bytes, 560x420) |  |  |  |
