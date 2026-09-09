# Extension Validation Report

- Extension: tachiyomi-en.mangack-v1.4.2
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
- Source ID: 7208855238528281651
- Source name: Mangack
- Source language: en
- Selected manga input: popular offset 0: Holy Emperor’s Grandson Is A Necromancer (`.../holy-emperors-grandson-is-a-necromancer`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Holy Emperor’s Grandson Is A Necromancer (`.../holy-emperors-grandson-is-a-necromancer`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | I Regressed, but the World didn’t End (`.../i-regressed-but-the-world-didnt-end`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 60 | When a Genius Office Worker Goes Too Far (`.../when-a-genius-office-worker-goes-too-far`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 60 | The Tutorial Is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Holy Emperor’s Grandson Is A Necromancer (`.../holy-emperors-grandson-is-a-necromancer`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Holy Emperor’s Grandson Is A Necromancer (`.../holy-emperors-grandson-is-a-necromancer`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 128 | CHAPTER 1 (`.../holy-emperors-grandson-is-a-necromancer-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Holy Emperor’s Grandson Is A Necromancer, URL=`.../holy-emperors-grandson-is-a-necromancer` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangack.com/.../Holy-Emperors-Grandson-Is-A-Necromancer.webp` (image/webp (encoding: lossy), 68496 bytes, 600x855) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../holy-emperors-grandson-is-a-necromancer` |  |  |  |
| details thumbnail URL | PASS | `https://mangack.com/.../Holy-Emperors-Grandson-Is-A-Necromancer.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Our MC dies from an accidental electrocution and ends up inhabiting the body of a young prince in another world, his new profession being the Necromancer he chose in the game he was playing before his untimely demise. However, things are not what they seem – including his own Necromancy skills! Grandson of the Holy … <p class="read-more"><a class="btn btn-default" href="https://mangack.com/.../%22%3E Read More<span class="screen-reader-text">  Read More<.../p%3E<br><br>Alternative: Grandson of the Holy Emperor Is a Necromancer<br><br>Year: 2023<br><br>Followers: 99<br><br>Views: 4.2K |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 128 chapters |  |  |  |
| chapter dates | PASS | 128 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.black-clover.org/.../1.webp` (image/webp (encoding: lossy), 456642 bytes, 800x10637) |  |  |  |
