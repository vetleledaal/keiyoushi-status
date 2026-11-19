# Extension Validation Report

- Extension: tachiyomi-en.mangack-v1.6.1
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
- Source ID: 7208855238528281651
- Source name: Mangack
- Source language: en
- Selected manga input: popular offset 0: Damn Reincarnation (`.../damn-reincarnation`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Damn Reincarnation (`.../damn-reincarnation`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | My Mom is my Constellation (`.../my-mom-is-my-constellation`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 60 | Lookism (`.../lookism`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | My Gift Lvl 9999 Unlimited Gacha (`.../my-gift-lvl-9999-unlimited-gacha`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Damn Reincarnation (`.../damn-reincarnation`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Damn Reincarnation (`.../damn-reincarnation`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 82 | CHAPTER 1 (`.../damn-reincarnations-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Damn Reincarnation, URL=`.../damn-reincarnation` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangack.com/.../Damn-Reincarnation.webp` (image/webp (encoding: lossy), 26546 bytes, 600x855) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../damn-reincarnation` |  |  |  |
| details thumbnail URL | PASS | `https://mangack.com/.../Damn-Reincarnation.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The warrior Hamel went on an adventure with his companions to defeat the Demon Kings, but ended up dying just before the final battle with them…. “Waaah.” ‘What the hell!’ He was reincarnated as one of the descendants of his fellow warrior, Vermouth. Hamel — no, Eugene Lionheart was reborn with the blood of the … <p class="read-more"><a class="btn btn-default" href="https://mangack.com/.../%22%3E Read More<span class="screen-reader-text">  Read More<.../p%3E<br><br>Alternative: Bireomeogeul Hwansaeng 빌어먹을 환생<br><br>Year: 2022<br><br>Followers: 386<br><br>Views: 641.2K |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 82 chapters |  |  |  |
| chapter dates | PASS | 82 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.black-clover.org/.../1.webp` (image/webp (encoding: lossy), 183132 bytes, 800x5957) |  |  |  |
