# Extension Validation Report

- Extension: tachiyomi-th.sodsaime-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8174267898467838103
- Source name: สดใสเมะ
- Source language: th
- Selected manga input: latest offset 0: Hangyakusha to Shite Oukoku de Shokei Sareta Kakure Saikyu Kishi (`.../hangyakusha-to-shite-oukoku-de-shokei-sareta-kakure-saikyu-kishi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 40 | Martial Peak เทพยุทธ์เหนือโลก (`.../martial-peak-%E0%B9%80%E0%B8%97%E0%B8%9E%E0%B8%A2%E0%B8%B8%E0%B8%97%E0%B8%98%E0%B9%8C%E0%B9%80%E0%B8%AB%E0%B8%99%E0%B8%B7%E0%B8%AD%E0%B9%82%E0%B8%A5%E0%B8%81`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 40 | Genius Grandson of the Loan Shark King (`.../genius-grandson-of-the-loan-shark-king`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 40 | Hangyakusha to Shite Oukoku de Shokei Sareta Kakure Saikyu Kishi (`.../hangyakusha-to-shite-oukoku-de-shokei-sareta-kakure-saikyu-kishi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 40 | Touhou – Marisa to Alice no Fushin na Ningyou (`.../touhou-marisa-to-alice-no-fushin-na-ningyou`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Hangyakusha to Shite Oukoku de Shokei Sareta Kakure Saikyu Kishi (`.../hangyakusha-to-shite-oukoku-de-shokei-sareta-kakure-saikyu-kishi`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Hangyakusha to Shite Oukoku de Shokei Sareta Kakure Saikyu Kishi (`.../hangyakusha-to-shite-oukoku-de-shokei-sareta-kakure-saikyu-kishi`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | ตอนที่ 1 (`.../hangyakusha-to-shite-oukoku-de-shokei-sareta-kakure-saikyu-kishi-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 48 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hangyakusha to Shite Oukoku de Shokei Sareta Kakure Saikyu Kishi, URL=`.../hangyakusha-to-shite-oukoku-de-shokei-sareta-kakure-saikyu-kishi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.xn--l3c0azab5a2gta.com/.../dc5bb0b72677ef1f7cd9de6a040a3e7d-1.jpg` (image/jpeg, 81038 bytes, 400x564) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hangyakusha-to-shite-oukoku-de-shokei-sareta-kakure-saikyu-kishi` |  |  |  |
| details thumbnail URL | PASS | `https://www.xn--l3c0azab5a2gta.com/.../dc5bb0b72677ef1f7cd9de6a040a3e7d-1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Manga, Romance, Tragedy, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | อัลเดีย อัศวินที่แข็งแกร่งที่สุดของอาณาจักร เป็นบุคคลสำคัญในการยุติสงครามระหว่างอาณาจักรเลชเฟลด์และจักรวรรดิวัลแคน แม้ว่าอัลเดียจะกลายเป็นวีรบุรุษ แต่เขากลับถูกประหารชีวิตในฐานะผู้ทรยศด้วยเหตุผลที่ไม่เป็นความจริง ด้วยความเสียใจในใจที่ไม่สามารถช่วยเจ้าหญิงวัลตรูนแห่งจักรวรรดิได้ ผู้ที่ช่วยชีวิตเขาไว้เมื่อเขาใกล้ตาย แม้ว่าทั้งสองจะเป็นศัตรูกันก็ตาม อย่างไรก็ตาม เมื่ออัลเดียตื่นขึ้นมา เขาพบว่าตัวเองอยู่ในโลกเมื่อหกปีก่อนที่สงครามจะปะทุขึ้น! ด้วยความมุ่งมั่นที่จะช่วยชีวิตวัลตรูน ซึ่งเขาตัดสินใจว่าไม่สามารถทำได้ก่อนหน้านี้ อัลเดียจึงตัดสินใจให้คำมั่นสัญญาว่าจะจงรักภักดีต่อเจ้าหญิงในฐานะอัศวินแห่งจักรวรรดิวัลแคนในชีวิตที่สองของเขา และเปลี่ยนแปลงโลก! นี่คือเรื่องราวการย้อนอดีตของอัศวินที่เคยถูกประหารชีวิต ซึ่งกลับมาเป็นผู้แข็งแกร่งที่สุดอีกครั้ง!! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.xn--l3c0azab5a2gta.com/.../NUOXGQ93WF-1776835804.jpg` (image/jpeg, 375292 bytes, 1000x1418) |  |  |  |
