# Extension Validation Report

- Extension: tachiyomi-all.hentaienvy-v1.6.10
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: galleryadults
- Source ID: 8073115021554725655
- Source name: HentaiEnvy
- Source language: en
- Selected manga input: popular offset 0: Artist - Nia4294 (`.../1569763`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 28 | Artist - Nia4294 (`.../1569763`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | MrScrambled art dump (`.../1596100`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 28 | crymini x loona (ongoing) (`.../1602638`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 28 | MHA Midoriya timeline [Amano44] (`.../1602535`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Artist - Nia4294 (`.../1569763`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Artist - Nia4294 (`.../1569763`) |  | <1s |
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
| latest pagination | UNUSUAL | Overlapping manga: title=MHA Midoriya timeline \[Amano44\], URL=`.../1602535` at page 1 offset 16 and page 2 offset 0, title=\[Patreon\]Chaban(26.2.3-26.9.9), URL=`.../1602532` at page 1 offset 17 and page 2 offset 1, title=\[e621\] zacianswords, URL=`.../1602527` at page 1 offset 18 and page 2 offset 2, title=\[Dirty Bunny\] Brambletree Family Summer Break Part 2: Family History (ongoing), URL=`.../1602525` at page 1 offset 19 and page 2 offset 3, title=\[Skip Beat Studio (Gar)\] If We Kiss, We'll Have a Baby! ~The Sanpaku-Eyed Delinquent Slut (Rumored) Who's Actually a Tall Girl with Zero Sex Knowledge, and Me, the Disciplinary Committee Member Who's Desperately Trying To Suppress His Insane Libido~ \[English\], URL=`.../1602524` at page 1 offset 20 and page 2 offset 4, title=(C96) \[Arinotowatari\] No one's attaining any enlightment with those huge boobs around (FateGrand Order) (English), URL=`.../1602519` at page 1 offset 21 and page 2 offset 5, title=(C97) \[DEAR LIFE (Eshimoto)\] Musashi's Lewd Book 2 (FateGrand Order) (English), URL=`.../1602514` at page 1 offset 22 and page 2 offset 6, title=\[ sweetdreamcoffee \] A Bakers Dozen, URL=`.../1602513` at page 1 offset 23 and page 2 offset 7, title=(C95) \[Boston Tea Party (TeaIndian)\] Father saw all of it!! (Fate/Grand Order) (English), URL=`.../1602512` at page 1 offset 24 and page 2 offset 8, title=Kawaii Sukeyru, URL=`.../1602507` at page 1 offset 25 and page 2 offset 9, title=\[akarika057\] Fanbox Collection (Aug 26th, 2026), URL=`.../1602504` at page 1 offset 26 and page 2 offset 10, title=\[Yajirushi Key (Meito)\] Kasou Douwa wa Kiken ga Ippai!? Yumemi Gachi na Shoujo Hen 2 \[English\] \[Digital\], URL=`.../1602502` at page 1 offset 27 and page 2 offset 11 |  |  |  |
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
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://m11.hentaienvy.com/.../1.webp` (image/webp (encoding: lossy), 263756 bytes, 1280x1810) |  |  |  |
