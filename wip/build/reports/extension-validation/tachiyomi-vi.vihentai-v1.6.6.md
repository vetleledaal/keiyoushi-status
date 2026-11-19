# Extension Validation Report

- Extension: tachiyomi-vi.vihentai-v1.6.6
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 4004369226840135398
- Source name: ViHentai
- Source language: vi
- Selected manga input: popular offset 0: Truyện của Rayasi (`.../cau-tieu-thit`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Truyện của Rayasi (`.../cau-tieu-thit`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | Tổng hợp sếch tốc độ của Bonz0616 (`.../tong-hop-sech-ngan-cua-bonz0616`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | Thanh khiết, đạo mạo và dục tính (`.../thanh-khiet-dao-mao-va-duc-tinh`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 60 | NTR - Người yêu bị cướp đoạt - Báo cáo nhập hồn! (`.../ntr-nguoi-yeu-bi-cuop-doat-bao-cao-nhap-hon`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 60 | Truyện của Rayasi (`.../cau-tieu-thit`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Truyện của Rayasi (`.../cau-tieu-thit`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 44 | Người dọn vệ sinh (`.../one-ban`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Truyện của Rayasi, URL=`.../cau-tieu-thit` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 300/300 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 300/300 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.shousetsu.dev/.../4de52408-9fee-4726-b473-b1fcc0f7ca59-1792052041.jpg` (image/jpeg, 62093 bytes, 500x662) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cau-tieu-thit` |  |  |  |
| details thumbnail URL | PASS | `https://img.shousetsu.dev/.../4de52408-9fee-4726-b473-b1fcc0f7ca59-1792052041.jpg` |  |  |  |
| details author | PASS | Rayasi 2 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Condom 2179, Dirty 309, Exhibitionism 2245, Sex Toys 3575, Stockings 8557, Bukkake 150, Ryona 397, Mind Control 1966, Piercing 103, Glasses 3895, School Uniform 7009, Slave 1746, Spanking 34, Teacher 2581, Idol 529, Romance 5249, Vtuber 188, BDSM 1550, Big Ass 8931, Big Breasts 26361, Nakadashi 16625, Transformation 282, Twintails 1935, X-ray 8783, Body Writing 89, Small Boobs 5426, Crotch Tattoo 301, Lolicon 6803, Không che 10404, Tall Girl 708, Tomboy 944, Anal 8513, Bestiality 575, Mind Break 4424, Blindfold 80, Chastity belt 47, Father 197, Pregnant 2356, Daughter 351, Full Color 8095, Masturbation 3019, Amputee ★ 11, Ahegao 13535, Big Penis 9535, Black skin 138, Color 27, Cowgirl 13, Creampie 848, Drugs 1371, Family 12, GangBang 1913, Impregnation 101, Stocking 54, Uncensored 37, Urination 11, Incest ★ 5013, Guro ★ 499 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Link để lấy truyện up nét hơnhttps://drive.google.com/.../8 coming soon...Ra rồihttps://vi-hentai.pro/.../oneshot-no-3-lo |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 44 chapters |  |  |  |
| chapter dates | PASS | 44 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.shousetsu.dev/.../0.jpg` (image/jpeg, 416277 bytes, 1809x2560) |  |  |  |
