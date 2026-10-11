# Extension Validation Report

- Extension: tachiyomi-pt.euphoriascan-v1.6.55
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 6045078216682014867
- Source name: Euphoria Scan
- Source language: pt-BR
- Selected manga input: latest offset 0: Bones and Petals (`.../250`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | A Sedução da Serpente Sagrada (`.../423`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Love & Hatred (`.../126`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Bones and Petals (`.../250`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Speak up (`.../873`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bones and Petals (`.../250`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bones and Petals (`.../250`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 77 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bones and Petals, URL=`250` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 100/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://euphoriascan.com/.../tall-350x476.webp` (image/webp (encoding: lossy), 40222 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `250` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://euphoriascan.com/.../tall-193x278.webp` (image/webp (encoding: lossy), 14076 bytes, 193x278) |  |  |  |
| details author | PASS | Miro (미로) |  |  |  |
| details artist | PASS | Miro (미로) |  |  |  |
| details genres | PASS | Adult, Completo, Drama, Hard, obsessão, Romance, Supernatural, Violência |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Fansub: Euphoria Scan<br><br>Em um mundo onde humanos e vampiros coexistem, o sanguinário Jess cai em uma armadilha humana e é aprisionado no porão de um campo de escravos. O diretor do campo, Philip, conduz experimentos e tortura, Jess na tentativa de curar sua doença genética, mas por algum motivo, ao contrário de outros vampiros, Jess não consegue se recuperar. Para interromper o experimento e restaurar, Philip aprisiona um de seus escravos, John, um ex-médico, junto com Jess. John não pode sair da prisão até que a condição de Jess se recupere. No final, ele tenta abrir o coração de Jess, que é muito cauteloso, e no processo, John fica cada vez mais fascinado por Jess, um vampiro misterioso. Jess percebe que Johan gosta dele e finge aceitar seu coração para usá-lo para escapar da masmorra… Será que os dois conseguirão escapar desse inferno juntos? Se eu realmente escapar daqui, poderei voltar para minha vida anterior?<br><br>Nomes alternativos: 뼈와 꽃잎 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | LINT | 67 of 77 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=67 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://euphoriascan.com/.../0.jpg` (image/jpeg, 171814 bytes, 1280x720) |  |  |  |
