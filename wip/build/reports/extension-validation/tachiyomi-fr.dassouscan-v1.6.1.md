# Extension Validation Report

- Extension: tachiyomi-fr.dassouscan-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7036720639283559699
- Source name: Dassou Scan
- Source language: fr
- Selected manga input: popular offset 0: I’m an Evil God (`.../im-an-evil-god`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | I’m an Evil God (`.../im-an-evil-god`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 14 | I Ushered in the Age of Mythical Pet Beasts (`.../i-ushered-in-the-age-of-mythical-pet-beasts`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | Past-Life Demon (`.../past-life-demon`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 14 | Defiance of the Fall (`.../defiance-of-the-fall`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I’m an Evil God (`.../im-an-evil-god`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I’m an Evil God (`.../im-an-evil-god`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 110 | Chapitre 0 (`.../chapitre-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 2 |  |  | 1-10s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I’m an Evil God, URL=`.../im-an-evil-god` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://dassouscan.com/.../cover.webp` (image/webp (encoding: lossy), 234964 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../im-an-evil-god` |  |  |  |
| details thumbnail URL | PASS | `https://dassouscan.com/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Arts martiaux, Fantasy, Isekai, Romance, Drame, Comédie, Aventure, Shōnen |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | À travers les royaumes, est le dieu maléfique le plus viril et le plus beau de l’histoire ! Le bel homme sans égal Xie Yan a traversé et est tombé dans l’antre de la renarde. Afin de ne pas être vidé de toute sa force vi... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 110 chapters |  |  |  |
| chapter dates | PASS | 110 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 2 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://dassouscan.com/.../page-001.webp <redacted query values: v>` (image/webp (encoding: lossy), 1129568 bytes, 800x15364) |  |  |  |
