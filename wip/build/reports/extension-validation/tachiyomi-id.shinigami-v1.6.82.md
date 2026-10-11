# Extension Validation Report

- Extension: tachiyomi-id.shinigami-v1.6.82
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
- Source ID: 3411809758861089969
- Source name: Shinigami
- Source language: id
- Selected manga input: popular offset 0: Demonic Emperor (`.../c0f1d049-ff7f-474d-8c6a-3a55e4c44147`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Demonic Emperor (`.../c0f1d049-ff7f-474d-8c6a-3a55e4c44147`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Ranker's Return (Remake) (`.../a7c7a576-f2cc-47c7-b915-bb64212f8b56`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Though I’m a Homebody, I Found Myself in a Dark Captive Genre (`.../e1d19a82-31f2-47c3-8937-0de79bc1bec3`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The World’s Best Kunlun Tavern (`.../2b5ce520-b7e2-4b17-9b9e-6ed2d4fa4320`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 29 | Demonic Emperor (`.../c0f1d049-ff7f-474d-8c6a-3a55e4c44147`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Demonic Emperor (`.../c0f1d049-ff7f-474d-8c6a-3a55e4c44147`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 923 | Chapter 1 (`.../8b01b9ec-876c-4908-b153-97e86bc9e12f`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 65 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Demonic Emperor, URL=`c0f1d049-ff7f-474d-8c6a-3a55e4c44147` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 149/149 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 149/149 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.shngm.id/.../8c4fdbee-ffb8-427d-ace7-f21fe6b72f77.jpg` (image/jpeg, 282071 bytes, 720x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `c0f1d049-ff7f-474d-8c6a-3a55e4c44147` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://assets.shngm.id/.../d00e4253-656d-481e-b3ef-701e4c6d451e.jpg` was not downloaded |  |  |  |
| details author | PASS | Wuer Manhua, Ye Xiao |  |  |  |
| details artist | PASS | Wuer Manhua |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Karena dia memiliki warisan Ancient Demonic emperor Demonic Emperor Zhuo Yifan menemui nasib sial karena dikhianati dan dibunuh oleh murid kepercayaannya Setelah terlahir kembali kultivasinya kembali ke nol dan dia terjebak oleh heart demon tidak diberi pilihan selain menjadi pengurus rumah tangga dari satusatunya nona tertua Keluarga Luo Dari menjadi Demonic Emperor menjadi pengurus rumah tangga yang tidak penting bagaimana dia bisa bergaul dengan eart demon eldest miss dan kekuatan apa yang akan dia peroleh untuk memimpin dirinya sendiri dan keluarga yang menurun untuk bangkit kembali ke puncak benuaaa<br><br>Alternative Title: Magic Emperor, 魔皇大管家 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 923 chapters |  |  |  |
| chapter dates | PASS | 923 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 65 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://assets.shngm.id/.../1-4b02d22465c4.jpg` (image/jpeg, 60444 bytes, 620x735) |  |  |  |
