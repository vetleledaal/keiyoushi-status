# Extension Validation Report

- Extension: tachiyomi-th.mangakimi-v1.4.35
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 358347131669055728
- Source name: MangaKimi
- Source language: th
- Selected manga input: latest offset 0: Honzuki no Gekokujou: Ferdinand no Yakata ni Te (`.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | I Became the Male Lead’s Adopted Daughter ฉันกลายเป็นลูกสาวบุญธรรมของท่านดยุก (`.../i-became-the-male-leads-adopted-daughter`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Not-Sew-Wicked Stepmom ฉันเป็นแม่เลี้ยงนะ แต่ลูกสาวน่ารักเกินไปแล้ว (`.../not-sew-wicked-stepmom`) |  | 1-10s |
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
| thumbnail | PASS | `https://www.mangakimi.com/.../b351e49e4c25c9cbfad4c3cb69b97c02-1.jpg` (image/jpeg, 77147 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../honzuki-no-gekokujou-ferdinand-no-yakata-ni-te` |  |  |  |
| details thumbnail URL | PASS | `https://www.mangakimi.com/.../b351e49e4c25c9cbfad4c3cb69b97c02-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Manga, Shounen, Supernatural, Manga |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
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
| page load | PASS | `https://img.mangakimi.com/.../FVQMWR8E9C-1780576804.jpg` (image/jpeg, 288348 bytes, 1000x1429) |  |  |  |
