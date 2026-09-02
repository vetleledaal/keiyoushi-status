# Extension Validation Report

- Extension: tachiyomi-th.reapertrans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
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
- Source ID: 9050053825457509475
- Source name: ReaperTrans
- Source language: th
- Selected manga input: latest offset 0: Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Astral Pet Store (`.../astral-pet-store`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Mr Devourer Please Act Like a Final Boss (`.../mr-devourer-please-act-like-a-final-boss`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 158 | Chapter 1 (`.../revenge-of-the-iron-blooded-sword-hound-%E0%B8%95%E0%B8%AD%E0%B8%99%E0%B8%97%E0%B8%B5%E0%B9%88-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Revenge of the Iron-Blooded Sword Hound, URL=`.../revenge-of-the-iron-blooded-sword-hound` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://reapertrans.com/.../revenge-of-the-iron-blooded-sword-hound.jpg` (image/jpeg, 229558 bytes, 720x1034) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../revenge-of-the-iron-blooded-sword-hound` |  |  |  |
| details thumbnail URL | PASS | `https://reapertrans.com/.../revenge-of-the-iron-blooded-sword-hound.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เรื่องย่อ Revenge of the Iron-Blooded Sword Hound บีเคอร์ เเวน บาสเกอร์วิลล์ หมาล่าเนื้อเเห่งตระกูลบาสเกอร์วิลล์ ถูกทรยศเเละได้รับคำสั่งประหารชีวิต ก่อนตายเขาได้สาบานต่อตนเองไว้ว่า “หากมีโอกาสอีกครั้ง ฉันจะไม่ยอมเป็นหมารับใช้ของพวกมันอีกเเล้ว” ทว่า..คำสาบานเขาส่งผลทำให้เขาย้อนเวลากลับมาเป็นเด็กอีกครั้ง หลังจากที่เขาตายลงไปก็ได้พบว่าตัวเองนั้นได้ลืมตาตื่นขึ้นมาในร่างของทารกและได้พบเจอกับ ฮิวโก้ เลอ บาสเกอร์วิลล์ ผู้ที่เป็นหัวหน้าตระกูลและคนสั่งประหารเขาในชีวิตที่แล้ว ทำให้เขามั่นใจว่าตัวเองนั้นได้ย้อนเวลากลับมาในช่วงที่ยังเป็นเพียงทารก เขาใช้ทั้งความรู้และโอกาสทั้งหมดให้แก่ตัวเองเพื่อที่จะได้แข็งแกร่งขึ้นอย่างรวดเร็วโดยที่มีเป้าหมายหลักคือการทำลายตระกูล Baskerville ให้หายไปจากประวัติศาสตร์ด้วยน้ำมือของเขาเอง “รอฉันก่อนนะฮิวโก้ คราวนี้ฉันจะฉีกขากรรไกรของนายเป็นชิ้นๆ” และแล้ว การล้างแค้นอันนองเลือดของหมาล่าเนื้อก็ได้เริ่มต้นขึ้น! อ่านมังงะ Revenge of the Iron-Blooded Sword Hound ตอนใหม่ก่อนใครได้ที่เพจ reapertrans.com หรือติดตามรายละเอียดได้ที่เพจ : Lamires Translator |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 158 chapters |  |  |  |
| chapter dates | PASS | 158 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://bbb.webtoon168.com/.../b49b7f5a3af0f2eba860f570f93f8755.jpg` (image/jpeg, 2128035 bytes, 800x9244) |  |  |  |
