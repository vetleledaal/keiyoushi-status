# Extension Validation Report

- Extension: tachiyomi-vi.truyenhentaivn-v1.6.6
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
- Source ID: 2450247754585878955
- Source name: TruyenHentaivn
- Source language: vi
- Selected manga input: popular offset 0: RAINBOW SEX Girl's Frontline (`.../36503-doc-truyen-rainbow-sex-girls-frontline.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | RAINBOW SEX Girl's Frontline (`.../36503-doc-truyen-rainbow-sex-girls-frontline.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Ore no Kaa-chan | My Mother (`.../36469-doc-truyen-ore-no-kaa-chan-my-mother.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | RAINBOW SEX Girl's Frontline (`.../36503-doc-truyen-rainbow-sex-girls-frontline.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Mori no Majo (`.../36473-doc-truyen-mori-no-majo.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | RAINBOW SEX Girl's Frontline (`.../36503-doc-truyen-rainbow-sex-girls-frontline.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | RAINBOW SEX Girl's Frontline (`.../36503-doc-truyen-rainbow-sex-girls-frontline.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../36503-69473-xem-truyen-rainbow-sex-girls-frontline-oneshot.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=RAINBOW SEX Girl's Frontline, URL=`.../36503-doc-truyen-rainbow-sex-girls-frontline.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://upload.truyenhentaivn.store/.../iwz9dfi7.png` (image/png, 322999 bytes, 350x494) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../36503-doc-truyen-rainbow-sex-girls-frontline.html` |  |  |  |
| details thumbnail URL | PASS | `https://upload.truyenhentaivn.store/.../iwz9dfi7.png` |  |  |  |
| details author | PASS | FF32 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BreastJobs, Based Game, Big Ass, Big Penis, Comedy, Glasses, Femdom, Big Boobs, Doujinshi, Oneshot |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | fuze và súng của anh |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s1.truyenhentaivn.store/.../0.png <redacted query values: expires and token>` (image/png, 2434048 bytes, 3000x1684) |  |  |  |
