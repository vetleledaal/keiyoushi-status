# Extension Validation Report

- Extension: tachiyomi-all.lectorhentai-v1.6.2
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
- Source implementation: keiyoushi.source.b
- Source theme: mangathemesia
- Source ID: 8489181931479760463
- Source name: Lector Hentai
- Source language: en
- Selected manga input: popular offset 0: Teniendo sexo con la mama de mi amigo (`.../teniendo-sexo-con-la-mama-de-mi-amigo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Teniendo sexo con la mama de mi amigo (`.../teniendo-sexo-con-la-mama-de-mi-amigo`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Mimamori Moto Bitch (`.../mimamori-moto-bitch`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Usotsuki na Kaa-san (`.../usotsuki-na-kaa-san`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Harlivy No Regrets Part 1 (`.../harlivy-no-regrets-part-1`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 17 | Teniendo sexo con la mama de mi amigo (`.../teniendo-sexo-con-la-mama-de-mi-amigo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Teniendo sexo con la mama de mi amigo (`.../teniendo-sexo-con-la-mama-de-mi-amigo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../teniendo-sexo-con-la-mama-de-mi-amigo`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Teniendo sexo con la mama de mi amigo, URL=`.../teniendo-sexo-con-la-mama-de-mi-amigo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 117/117 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 117/117 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img3.giolandscaping.com/.../677996df8717d_cover.webp` (image/webp (encoding: lossy), 15106 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../teniendo-sexo-con-la-mama-de-mi-amigo` |  |  |  |
| details thumbnail URL | PASS | `https://img3.giolandscaping.com/.../677996df8717d_cover.webp` |  |  |  |
| details author | PASS | Drachef, Dorachefu |  |  |  |
| details artist | PASS | Drachef, Dorachefu |  |  |  |
| details genres | PASS | Ahegao, Big breasts, Blowjob, Mature, Milf, Shotacon, Bbw, Big breast creampie milf, Culona, Enormes tetas y nalgas, Madura |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★★★ 5 (3)<br>Hentai · hentai |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.giolandscaping.com/.../000.webp` (image/webp (encoding: lossy), 135434 bytes, 1280x1790) |  |  |  |
