# Extension Validation Report

- Extension: tachiyomi-en.mangayi-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Selected manga input: popular offset 0: A Secretly Capable Child Is Seeking For Her Dad (`.../a-secretly-capable-child-is-seeking-for-her-dad`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | A Secretly Capable Child Is Seeking For Her Dad (`.../a-secretly-capable-child-is-seeking-for-her-dad`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Legend of the Holy Sword (`.../legend-of-the-holy-sword`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | A Secretly Capable Child Is Seeking For Her Dad (`.../a-secretly-capable-child-is-seeking-for-her-dad`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Secretly Capable Child Is Seeking For Her Dad (`.../a-secretly-capable-child-is-seeking-for-her-dad`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 49 | Chapter 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Secretly Capable Child Is Seeking For Her Dad, URL=`a-secretly-capable-child-is-seeking-for-her-dad` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://scp.keterfoundation.com/.../a-secretly-capable-child-is-seeking-for-her-dad.jpg` (image/jpeg, 313132 bytes, 547x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-secretly-capable-child-is-seeking-for-her-dad` |  |  |  |
| details thumbnail URL | PASS | `https://scp.keterfoundation.com/.../a-secretly-capable-child-is-seeking-for-her-dad.jpg` |  |  |  |
| details author | PASS | Glee (글리), Kim Gu-Seul |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Shoujo, Adventure, Fantasy, Comedy, Mystery, Manhwa, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | At the age of four, Astyr received her father’s death notice.<br>「In accordance with Article 12, Paragraph 1 of the Act on Funeral Services, the body of the deceased without family ties will be disposed of and publicly announced. Relatives are requested to claim the enshrined remains.」<br>Her dad was always saying strange things. That he came from an empire called Talochium. And he believed that Tyr’s hometown was there, too.<br>“Daddy will live with Tyr for a long, long time. One day, we’ll return to our hometown, and Tyr will be able to laugh in a much bigger and cleaner house.”<br>He talked about returning to his homeland. About making her happy. In the end, he just left Tyr behind. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 49 chapters |  |  |  |
| chapter dates | PASS | 49 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://scp.keterfoundation.com/.../1.jpg` (image/jpeg, 265061 bytes, 720x3000) |  |  |  |
