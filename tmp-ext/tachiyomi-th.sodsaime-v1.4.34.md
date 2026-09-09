# Extension Validation Report

- Extension: tachiyomi-th.sodsaime-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8174267898467838103
- Source name: สดใสเมะ
- Source language: th
- Selected manga input: latest offset 0: Honzuki no Gekokujou: Ferdinand no Yakata ni Te (`.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Martial Peak เทพยุทธ์เหนือโลก (`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Taming My Stepsister (`.../taming-my-stepsister`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | Honzuki no Gekokujou: Ferdinand no Yakata ni Te (`.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | This Hero is a Money Supremacist (`.../this-hero-is-a-money-supremacist`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Honzuki no Gekokujou: Ferdinand no Yakata ni Te (`.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Honzuki no Gekokujou: Ferdinand no Yakata ni Te (`.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | ตอนที่ 1 (`.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Honzuki no Gekokujou: Ferdinand no Yakata ni Te, URL=`.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.xn--l3c0azab5a2gta.com/.../28d30e16871c5f44d145664ccc5bb852-1.jpg` (image/jpeg, 77147 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te` |  |  |  |
| details thumbnail URL | PASS | `https://www.xn--l3c0azab5a2gta.com/.../28d30e16871c5f44d145664ccc5bb852-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Manga, Shounen, Supernatural, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | นี่คือเรื่องราวสปินออฟของหนอนหนังสือ ภาค 3 เฟอร์ดินันด์ หัวหน้านักบวชแห่งวิหารเอเรนเฟสต์ มีผู้คนที่เขาไว้วางใจอยู่ 3 คน ได้แก่ อัศวิน-เอ็กฮาร์ท ข้าราชการ-ยุสต็อกส์ และข้าราชบริพาร-ลาซาแฟม พวกเขาจะพบกันทุกครั้งที่มีโอกาสและแบ่งปันข้อมูลต่างๆ มากมาย สิ่งที่จะตามมาคือธรรมชาติที่แท้จริงของคนเหล่านี้ ซึ่งจะค่อยๆ เปิดเผยออกมาเบื้องหลังเรื่องราวหลัก การอ่านเรื่องนี้จะทำให้คุณหลงรักโลกของ “หนอนหนังสือ” มากยิ่งขึ้น! นี่คือจุดเริ่มต้นของชุดเรื่องราวแฟนตาซีเกี่ยวกับคนบ้าหนังสือ ซึ่งเล่าจากมุมมองของคน 3 คนที่ให้คำมั่นว่าจะจงรักภักดีต่อเฟอร์ดินันด์! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.xn--l3c0azab5a2gta.com/.../FVQMWR8E9C-1780576804.jpg` (image/jpeg, 288348 bytes, 1000x1429) |  |  |  |
