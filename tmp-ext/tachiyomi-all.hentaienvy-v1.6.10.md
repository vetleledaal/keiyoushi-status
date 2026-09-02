# Extension Validation Report

- Extension: tachiyomi-all.hentaienvy-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 8073115021554725655
- Source name: HentaiEnvy
- Source language: en
- Selected manga input: popular offset 0: Artist - Nia4294 (`.../1569763`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | Artist - Nia4294 (`.../1569763`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | MrScrambled art dump (`.../1596100`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | [Differland] Pentoffel & Yewevika Debut [ongoing] (`.../1598156`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | [Llamaboy] Overseer 69 [Ongoing] (`.../1598079`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Artist - Nia4294 (`.../1569763`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Artist - Nia4294 (`.../1569763`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../1569763`) |  | <1s |
| pages | `getPageList(chapter)` | success | 337 |  |  | 1-10s |

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
| popular listing | PASS | 28 entries |  |  |  |
| latest listing | PASS | 28 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Artist - Nia4294, URL=`.../1569763` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[Llamaboy\] Overseer 69 \[Ongoing\], URL=`.../1598079` at page 1 offset 26 and page 2 offset 0, title=\[Deeb890\] Cory & Abby: Chapter 3 - A Sensitive Kitty, URL=`.../1598072` at page 1 offset 27 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 113/113 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 113/113 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m11.hentaienvy.com/.../thumb.jpg` (image/jpeg, 54036 bytes, 250x353) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1569763` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://m11.hentaienvy.com/.../cover.jpg` (image/jpeg, 93498 bytes, 350x494) |  |  |  |
| details author | PASS | nia4294 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big ass, big breasts, big penis, blowjob, bodysuit, dark skin, eye-covering bang, ghost, huge breasts, latex, masturbation, milf, paizuri, pregnant, very long hair, western imageset |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Languages**: english<br><br>**Category**: western<br><br>**Pages**: 337 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 337 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://m11.hentaienvy.com/.../1.webp` (image/webp (encoding: lossy), 263756 bytes, 1280x1810) |  |  |  |
