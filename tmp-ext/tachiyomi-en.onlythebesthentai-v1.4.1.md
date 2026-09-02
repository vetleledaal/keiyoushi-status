# Extension Validation Report

- Extension: tachiyomi-en.onlythebesthentai-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5862792365006156918
- Source name: Only The Best Hentai
- Source language: en
- Selected manga input: latest offset 0: Confession Hole after (`.../confession-hole-after`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Confession Hole after (`.../confession-hole-after`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Megumi makes my dick Explode (`.../megumi-makes-my-dick-explode`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Confession Hole after (`.../confession-hole-after`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Megumi makes my dick Explode (`.../megumi-makes-my-dick-explode`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 9 | Confession Hole after (`.../confession-hole-after`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Confession Hole after (`.../confession-hole-after`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter [51 pages] (`.../confession-hole-after`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 51 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Confession Hole after, URL=`.../confession-hole-after` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://onlythebesthentai.com/.../01-1-768x1075.webp` (image/webp (encoding: lossy), 84860 bytes, 768x1075) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../confession-hole-after` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://onlythebesthentai.com/.../01-1.webp` (image/webp (encoding: lossy), 158820 bytes, 1280x1791) |  |  |  |
| details author | PASS | Flanvia |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big tits, blowjob, corruption, creampie, mind break, nun, slut |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Parody: Original<br>Pages: 51<br><br>Confession Hole after \[Zange Ana After\], Our favorite nun finally starts a new life with her true and only supporter. Will she be able to become a decent person or will she succumb to her lust? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 51 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://onlythebesthentai.com/.../01-1.webp` (image/webp (encoding: lossy), 158820 bytes, 1280x1791) |  |  |  |
