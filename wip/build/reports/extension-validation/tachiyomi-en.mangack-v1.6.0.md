# Extension Validation Report

- Extension: tachiyomi-en.mangack-v1.6.0
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
- Source ID: 7208855238528281651
- Source name: Mangack
- Source language: en
- Selected manga input: popular offset 0: Magic Level 99990000 All-Attribute Great Sage (`.../magic-level-99990000-all-attribute-great-sage`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Magic Level 99990000 All-Attribute Great Sage (`.../magic-level-99990000-all-attribute-great-sage`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Island of Stars and Chains (`.../island-of-stars-and-chains`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | SSS Grade Saint Knight (`.../sss-grade-saint-knight`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | So?Did Someone Force You to Become the Heavenly Demon (`.../so-did-someone-force-you-to-become-the-heavenly-demon`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Magic Level 99990000 All-Attribute Great Sage (`.../magic-level-99990000-all-attribute-great-sage`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Magic Level 99990000 All-Attribute Great Sage (`.../magic-level-99990000-all-attribute-great-sage`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 204 | CHAPTER 0 (`.../magic-level-99990000-all-attribute-great-sage-chapter-0`) |  | <1s |
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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Magic Level 99990000 All-Attribute Great Sage, URL=`.../magic-level-99990000-all-attribute-great-sage` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangack.com/.../Magic-Level-99990000-All-Attribute-Great-Sage.webp` (image/webp (encoding: lossy), 86036 bytes, 600x855) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../magic-level-99990000-all-attribute-great-sage` |  |  |  |
| details thumbnail URL | PASS | `https://mangack.com/.../Magic-Level-99990000-All-Attribute-Great-Sage.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Shounen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | All over the world, Monsters suddenly began appearing. The only person who could save humanity from “The Calamity” was “The Great Sage”, Ichikami Atsumu. But, despite being satisfied in his death, he was reincarnated into the body of a boy who was bullied into killing himself, Kusanagi Minato. Atsumu, waking up in a Japan fifty … <p class="read-more"><a class="btn btn-default" href="https://mangack.com/.../%22%3E Read More<span class="screen-reader-text">  Read More<.../p%3E<br><br>Alternative: Maryoku 9999 Man - Zen Zokusei Tsukai no Dai Kenja<br><br>Year: 2023<br><br>Followers: 106<br><br>Views: 4.4K |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 204 chapters |  |  |  |
| chapter dates | PASS | 204 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.black-clover.org/.../2.webp` (image/webp (encoding: lossy), 451960 bytes, 800x7368) |  |  |  |
