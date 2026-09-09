# Extension Validation Report

- Extension: tachiyomi-en.comicasura-v1.4.34
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
- Source theme: mangathemesia
- Source ID: 499082788596590240
- Source name: Comic Asura
- Source language: en
- Selected manga input: popular offset 0: Raised with Love (`.../raised-with-love`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | Raised with Love (`.../raised-with-love`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Kawaranai 'Miki' (`.../kawaranai-miki`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | My Healing Skill Can Copy Anything, So I Conquered the Abyss (`.../my-healing-skill-can-copy-anything-so-i-conquered-the-abyss`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Nano Machine (`.../nano-machinee`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Raised with Love (`.../raised-with-love`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Raised with Love (`.../raised-with-love`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter 0 (`.../chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | 1-10s |

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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Raised with Love, URL=`.../raised-with-love` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img-r1.2xstorage.com/.../raised-with-love.webp` (image/webp (encoding: lossy), 12928 bytes, 200x287) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../raised-with-love` |  |  |  |
| details thumbnail URL | PASS | `https://img-r1.2xstorage.com/.../raised-with-love.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, Drama, Shoujo, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A girl named Yoo-young, who had been left alone in an old apartment and raised by herself since the age of fourteen, one day discovers an eight-year-old boy named Sian sitting alone on the stairs as if he had been... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img-r1.2xstorage.com/.../0.webp` (image/webp (encoding: lossy), 28862 bytes, 1080x507) |  |  |  |
