# Extension Validation Report

- Extension: tachiyomi-id.sasangeyou-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1153502662292268302
- Source name: Sasangeyou
- Source language: id
- Selected manga input: popular offset 0: Saimin Seishidou (Original) Bahasa Indonesia (`.../saimin-seishidou-original-all-chapters-bahasa-indonesia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Saimin Seishidou (Original) Bahasa Indonesia (`.../saimin-seishidou-original-all-chapters-bahasa-indonesia`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Summertime Sweat Dripping Sex with Mother in the Boondocks (Original) Bahasa Indonesia (`.../summertime-sweat-dripping-sex-with-mother-in-the-boondocks-original-bahasa-indonesia`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Indeki (Original) Bahasa Indonesia (`.../indeki-original-bahasa-indonesia`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Hikikomori de Ero Manga Kaiteru Doutei Oikko to Oba-san ga Icha Love SEX suru Hanashi (Original) Bahasa Indonesia (`.../hikikomori-de-ero-manga-kaiteru-doutei-oikko-to-oba-san-ga-icha-love-sex-suru-hanashi-original-bahasa-indonesia`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Saimin Seishidou (Original) Bahasa Indonesia (`.../saimin-seishidou-original-all-chapters-bahasa-indonesia`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Saimin Seishidou (Original) Bahasa Indonesia (`.../saimin-seishidou-original-all-chapters-bahasa-indonesia`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 10 | Chapter 1 - Obata Yui to Tachibana Daiki no Baai (`.../saimin-seishidou-1-obata-yui-to-tachibana-daiki-no-baai-original-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Saimin Seishidou (Original) Bahasa Indonesia, URL=`.../saimin-seishidou-original-all-chapters-bahasa-indonesia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../Saimin-Seishidou-25_1.jpg <redacted query values: resize>` (image/jpeg, 18476 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../saimin-seishidou-original-all-chapters-bahasa-indonesia` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../Saimin-Seishidou-25_1.jpg` (image/jpeg, 275191 bytes, 1279x1800) |  |  |  |
| details author | PASS | Aiue Oka |  |  |  |
| details artist | PASS | 50on! |  |  |  |
| details genres | PASS | Ahegao, Big oppai, Blowjob, Cheating, Creampie, Group, Harem, Loli, Masturbation, Megane, Milf, Mind break, Mind control, Netorare, Original, Rape, Schoolgirl, Teacher, Uncensored, Doujin |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Download dan Baca Doujin Bahasa Indonesia tanpa IKLAN!!! Jangan lupa comment, bookmark, atau share ya. Doujin Detail: Source Pages 411 Pages Total Chapters 15 Chapters Chapter 1 (Obata Yui to Tachibana Daiki no Baai) 27 Pages Chapter 2 (Kurashiki Reina no Baai) 26 Pages Chapter 2,5 (Keika Kansatu) 18 Pages Chapter 2,75 (Taiken Shidou) 35 Pages Chapter 3 (Miyajima Sakura to Kase Masafumi no Baai) 42 Pages Chapter 4 (Ninshin Taiken Shidou (Shi)) 35 Pages Chapter 4 (Ninshin Taiken Shidou) 67 Pages Chapter 4,5 (Mikage Yuuki no Baai) 55 Pages (BELUM RILIS) Chapter 5 (kurashiki reika no Baai) 17 Pages Chapter 6 (Yuu Nozaki no Baai) 21 Pages Chapter 7 (Obata Natsumi No Baai) 30 Pages Chapter 8 (Soushuuhen) 53 Pages (BELUM RILIS) Chapter 9 (Saimin Seishidou: Video Learning (And Extras) V.1.0) 29 Pages (BELUM RILIS) Chapter 10 (Secret Lesson Tokuten Doujinshi Godo Gasshuku) 31 Pages (BELUM RILIS) Chapter 11 (Misao Takamine Extras) 7 Pages (BELUM RILIS) TUTORIAL: Tutorial Download Tutorial diblokir Follow Sosial Media sasangeyou agar tidak ketinggalan Info: Linktree Discord Dilihat: 36,968 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.sasangeyouku.my.id/.../Saimin-Seishidou-1_1.jpg.webp` (image/webp (encoding: lossy), 143072 bytes, 1280x1807) |  |  |  |
