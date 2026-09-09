# Extension Validation Report

- Extension: tachiyomi-id.bacami-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2677079941490683989
- Source name: Bacami
- Source language: id
- Selected manga input: latest offset 0: Kidnapped Dragons (`.../kidnapped-dragon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 15 | One Piece (`.../one-piece`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 15 | Wake Up, Warrior (`.../wake-up-warrior`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 15 | Kidnapped Dragons (`.../kidnapped-dragon`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 15 | Nano Machine (`.../nano-machine`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kidnapped Dragons (`.../kidnapped-dragon`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kidnapped Dragons Bahasa Indonesia (`.../kidnapped-dragon`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 59 | Chapter 01 (`.../kidnapped-dragons-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 68 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kidnapped Dragons, URL=`.../kidnapped-dragon` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bmcdn.my.id/.../978bdb6dnwq8G78a78cpaGlnhtpaGtvj8GzlAhkwBhnuht8Zl4GukjaGkp8GFt8GBrhnuht8G8ukjaGaGbGzwAAo5V.jpg` (image/jpeg, 34625 bytes, 283x400) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Kidnapped Dragons to Kidnapped Dragons Bahasa Indonesia |  |  |  |
| details thumbnail URL | PASS | `https://bmcdn.my.id/.../978bdb6dnwq8G78a78cpaGlnhtpaGtvj8GzlAhkwBhnuht8Zl4GukjaGkp8GFt8GBrhnuht8G8ukjaGaGbGzwAAo5V.jpg` |  |  |  |
| details author | PASS | Choi Jin-Hyung YUJU |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Harem, Psychological, Slice of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Planet Bumi telah memasuki keadaan abnormal 「Kiamat」. – Kamu gagal menyelamatkan Bumi. Otoritas 「Vintage Clock (EX)」 memutar kembali waktu dunia. Bagi Yu Jitae, pesan itu sudah sangat familiar. Situasi ini begitu melelahkan. Seandainya dia bisa mati bersama semua orang, itu akan lebih baik. Namun itu tidak bisa. Authority yang menjadikannya makhluk terkuat selalu membawanya kembali ke masa lalu setiap kali dia mati. Meski sekuat itu, dia tetap tidak mampu menyelamatkan dunia dari kegilaan para naga yang menghancurkan segalanya. – Waktu dunia akan segera dimulai kembali. Ketika jarum jam kembali bergerak seperti seharusnya, Regresi ke7 pun dimulai. Untungnya kali ini Yu Jitae mulai memahami cara meyelesaikan masalah ini.<br><br>Alternative Title: Kidnapped Dragons, 드래곤을 유괴하다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 59 chapters |  |  |  |
| chapter dates | PASS | 59 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://v1.bacami.site/.../1` to `https://v1.bacami.site/.../score` (1 redirects); latest: `https://v1.bacami.site/.../1` to `https://v1.bacami.site/.../latest` (1 redirects) |  |  |  |
| page load | PASS | `https://bmcdn.my.id/.../0-08ab8a86nwq8Gif7mcm7bgh8ecGldeicGma7bcGikg8cGgej9j8micGccbbh8aG9lK98aGc979aGntpaGhnuhtaGkp8GFt8GBrhnuht8GzukjaGaGbGzwAAoU3.jpg` (image/jpeg, 342307 bytes, 1233x747) |  |  |  |
